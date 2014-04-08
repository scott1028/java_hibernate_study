// 終端機編譯：
// C:\Users\scott\workspace\test_orm\src>javac -classpath C:/Users/scott/Downloads/hibernate-release-4.2.11.Final/lib/required/*;. test.java
// -classpath C:/Users/scott/Downloads/hibernate-release-4.2.11.Final/lib/required/*;. 其中 . 代表當前路徑, 因為有 City Class。

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
