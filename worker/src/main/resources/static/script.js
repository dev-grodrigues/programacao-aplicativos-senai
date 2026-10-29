function buscarWorker() {

    const id = document.getElementById('workerIdInput').value;
    const divResultado = document.getElementById('resultado');

    if (!id) {
        divResultado.innerHTML = `<p style="color:orange;">Por favor, introduza um ID válido.</p>`;
        return;
    }

    divResultado.innerHTML = `<p>A carregar...</p>`;

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
                    <h3>Nome: ${worker.name}</h3>
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