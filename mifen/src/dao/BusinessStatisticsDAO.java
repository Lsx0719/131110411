package dao;

import java.util.List;

import model.BusinessStatistics;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * BusinessStatistics entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see dao.BusinessStatistics
 * @author MyEclipse Persistence Tools
 */
public class BusinessStatisticsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(BusinessStatisticsDAO.class);
	// property constants
	public static final String SOLD_NUM = "soldNum";
	public static final String RICE_FLOUR_PRICE = "riceFlourPrice";
	public static final String TOTAL = "total";

	public void save(BusinessStatistics transientInstance) {
		log.debug("saving BusinessStatistics instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BusinessStatistics persistentInstance) {
		log.debug("deleting BusinessStatistics instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BusinessStatistics findById(java.lang.String id) {
		log.debug("getting BusinessStatistics instance with id: " + id);
		try {
			BusinessStatistics instance = (BusinessStatistics) getSession()
					.get("model.BusinessStatistics", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BusinessStatistics instance) {
		log.debug("finding BusinessStatistics instance by example");
		try {
			List results = getSession()
					.createCriteria("model.BusinessStatistics")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding BusinessStatistics instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from BusinessStatistics as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySoldNum(Object soldNum) {
		return findByProperty(SOLD_NUM, soldNum);
	}

	public List findByRiceFlourPrice(Object riceFlourPrice) {
		return findByProperty(RICE_FLOUR_PRICE, riceFlourPrice);
	}

	public List findByTotal(Object total) {
		return findByProperty(TOTAL, total);
	}

	public List findAll() {
		log.debug("finding all BusinessStatistics instances");
		try {
			String queryString = "from BusinessStatistics";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BusinessStatistics merge(BusinessStatistics detachedInstance) {
		log.debug("merging BusinessStatistics instance");
		try {
			BusinessStatistics result = (BusinessStatistics) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BusinessStatistics instance) {
		log.debug("attaching dirty BusinessStatistics instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BusinessStatistics instance) {
		log.debug("attaching clean BusinessStatistics instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}