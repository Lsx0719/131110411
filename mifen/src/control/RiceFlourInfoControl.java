package control;

import java.util.List;

import model.RiceFlourInfo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.RiceFlourInfoDAO;
import factory.HibernateSessionFactory;

public class RiceFlourInfoControl {
	
	private static RiceFlourInfoControl riceControl = null;
	public static RiceFlourInfoControl getControl(){
		if(riceControl==null){
			riceControl = new RiceFlourInfoControl();
		}
		return riceControl;
	}
	
	private Session session = null;
	private RiceFlourInfoDAO riceDao = null;
	
	private RiceFlourInfoControl(){
		session = HibernateSessionFactory.getSession();
		riceDao = new RiceFlourInfoDAO();
	}
	
	public void save(RiceFlourInfo rice){
		Transaction tr = session.beginTransaction();
		
		riceDao.save(rice);
		tr.commit();
		session.flush();
	}
		
	public List<RiceFlourInfo> getRiceAll()
	{
	    return riceDao.findAll();
	}
	
	public RiceFlourInfo getRiceByName(String riceName){
		return riceDao.findById(riceName);
	}
	
	public void update(RiceFlourInfo rice){
		Transaction tr = session.beginTransaction();
		
		riceDao.merge(rice);
		tr.commit();
		session.flush();
		
		
	}
		
		
	
	
	

}
