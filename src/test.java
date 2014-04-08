// 終端機編譯：
// 	javac -classpath "C:/Users/scott/Downloads/hibernate-release-4.2.11.Final/lib/required/*;C:/Program Files (x86)/MySQL/onnector J 5.1.26/*;." test.java -encoding utf-8
// 	-classpath "C:/Users/scott/Downloads/hibernate-release-4.2.11.Final/lib/required/*;C:/Program Files (x86)/MySQL/onnector J 5.1.26/*;." 其中 . 代表當前路徑, 因為有 City Class。

// 終端機執行：
// 	java -classpath "C:/Users/scott/Downloads/hibernate-release-4.2.11.Final/lib/required/*;C:/Program Files (x86)/MySQL/onnector J 5.1.26/*;." test

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
			System.out.println(a_city.getid());
			System.out.println(a_city.getName());
			System.out.println(a_city.getCountryCode());
			break;
		}
		
		c.close();
	}

}
