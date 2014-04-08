import org.zttc.itat.model.City;
import java.util.Iterator;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory c=cfg.buildSessionFactory(serviceRegistry);
		Session session = c.openSession();
		
		Criteria criteria = session.createCriteria(City.class);
		
		Iterator city = criteria.list().iterator();
		
		while(city.hasNext()){
			City a_city = (City) city.next();
			System.out.println(a_city.id);
		}
		
		c.close();
		
		System.out.println("1324");
	}

}
