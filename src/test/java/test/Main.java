package test;

import java.rmi.RemoteException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) throws RemoteException{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-mssql");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
				

	}

}
