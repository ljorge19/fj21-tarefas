package br.com.caelum.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

//	imports	omitidos
public class AdicionaTarefa {
	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Estudar JPA");
		tarefa.setFinalizado(false);
		//tarefa.setDataFinalizacao(Calendar.getInstance());
		
		Calendar dataFinalizacao = Calendar.getInstance();
		dataFinalizacao.set(1986, Calendar.OCTOBER, 03);
		tarefa.setDataFinalizacao(dataFinalizacao);
		
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("fj21");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
		System.out.println("ID	da	tarefa:	" + tarefa.getId());
		manager.close();
	}
}