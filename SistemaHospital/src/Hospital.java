import java.util.ArrayList;
import java.util.Scanner;
public class Hospital {
	Scanner sc = new Scanner(System.in);
	ArrayList<Medico> medicos = new ArrayList<>();

 public void adicionarMedico(Medico novoMedico) {
	 medicos.add(novoMedico);
 }
 public Medico buscarMedico(String crm) {
	 for(Medico medicoAtual : medicos) {
		 if(medicoAtual.getCrm().equals(crm)) {
			 return medicoAtual;
		 }
	 }
	 return null;
 }
 public Medico removerMedico(String crm) {
	 Medico medicoRemovido = null;
	 for (int i = 0; i < medicos.size(); i++) {
         if (medicos.get(i).getCrm().equalsIgnoreCase(crm)) {
             medicoRemovido = medicos.remove(i);
             break;
         }
	 	}
	 return medicoRemovido;
 	}
 public void listarMedicos() {
	if(medicos.isEmpty()) {
		System.out.println("Não há nenhum medico cadastrado!");
		return;
	}
	for(Medico medicoAtual: medicos) {
		System.out.println("Nome:"+medicoAtual.getNome()+" CRM:"+medicoAtual.getCrm()+" Idade:"+ medicoAtual.getIdade()+
				" Aposentado:"+ medicoAtual.medicoAposentado()+" Valor Aposentadoria:R$"+medicoAtual.valorAposentadoria());
	}	 
 }
}
