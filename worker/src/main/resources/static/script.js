function buscarWorker() {

    const id = document.getElementById('workerIdInput').value;
    const divResultado = document.getElementById('resultado');

    if (!id) {
        divResultado.innerHTML = `<p style="color:orange;">Por favor, introduza um ID válido.</p>`;
        return;
    }

    divResultado.innerHTML = `<p>Carregando...</p>`;

    fetch(`/workers/${id}`)
        .then(response => {
            if (!response.ok) {
                if (response.status === 404 || response.status === 500) {
                    throw new Error('Worker não encontrado.');
                }
                throw new Error('Erro na resposta da rede');
            }
            return response.json();
        })
        .then(worker => {
            divResultado.innerHTML = `
                <div class="worker-card">
                    <h3>Nome: ${worker.name} </h3>
                    <p>ID: ${worker.id_Worker}</p> 
                    <p>Nível: ${worker.level}</p>
                    <p>Salário Base: ${worker.baseSalary}</p>
                    <p class="department">Departamento: ${worker.department.name}</p>
                    <h4>Contratos:</h4>
                    <ul>
                        ${worker.contracts.map(c => `<li>Data: ${c.date} - Valor/Hora: ${c.valuePerHour}</li>`).join('')}
                    </ul>
                </div>
            `;
        })
        .catch(error => {
            console.error('Erro:', error);
            divResultado.innerHTML = `<p style="color:red;">Erro: ${error.message}</p>`;
        });
}
function listarTodos() {
    const divResultado = document.getElementById('resultado');
    divResultado.innerHTML = `<p>Carregando todos os workers...</p>`;


    fetch(`/workers`)
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao buscar a lista de workers.');
            }
            return response.json();
        })
        .then(workers => {

            divResultado.innerHTML = '';


            if (workers.length === 0) {
                divResultado.innerHTML = `<p>Nenhum worker cadastrado no banco de dados.</p>`;
                return;
            }


            workers.forEach(worker => {
                divResultado.innerHTML += `
                    <div class="worker-card">
                        <h3>Nome: ${worker.name} (ID: ${worker.id_Worker|| 'N/A'})</h3>
                        <p>Nível: ${worker.level}</p>
                        <p>Salário Base: R$ ${worker.baseSalary}</p>
                        <p class="department">Departamento: ${worker.department.name}</p>
                        <h4>Contratos:</h4>
                        <ul>
                            ${worker.contracts.map(c => `<li>Data: ${c.date} - Valor/Hora: R$ ${c.valuePerHour}</li>`).join('')}
                        </ul>
                    </div>
                `;
            });
        })
        .catch(error => {
            console.error('Erro:', error);
            divResultado.innerHTML = `<p style="color:red;">Erro: ${error.message}</p>`;
        });
}