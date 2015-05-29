package dao;

import java.util.List;

import model.RiceFlourInfo;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * RiceFlourInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see dao.RiceFlourInfo
 * @author MyEclipse Persistence Tools
 */
public class RiceFlourInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RiceFlourInfoDAO.class);
	// property constants
	public static final String RICE_FLOUR_PRICE = "riceFlourPrice";
	public static final String RICE_FLOUR_NUM = "riceFlourNum";

	public void save(RiceFlourInfo transientInstance) {
		log.debug("saving RiceFlourInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RiceFlourInfo persistentInstance) {
		log.debug("deleting RiceFlourInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RiceFlourInfo findById(java.lang.String id) {
		log.debug("getting RiceFlourInfo instance with id: " + id);
		try {
			RiceFlourInfo instance = (RiceFlourInfo) getSession().get(
					"model.RiceFlourInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RiceFlourInfo instance) {
		log.debug("finding RiceFlourInfo instance by example");
		try {
			List results = getSession().createCriteria("model.RiceFlourInfo")
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
		log.debug("finding RiceFlourInfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from RiceFlourInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRiceFlourPrice(Object riceFlourPrice) {
		return findByProperty(RICE_FLOUR_PRICE, riceFlourPrice);
	}

	public List findByRiceFlourNum(Object riceFlourNum) {
		return findByProperty(RICE_FLOUR_NUM, riceFlourNum);
	}

	public List findAll() {
		log.debug("finding all RiceFlourInfo instances");
		try {
			String queryString = "from RiceFlourInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RiceFlourInfo merge(RiceFlourInfo detachedInstance) {
		log.debug("merging RiceFlourInfo instance");
		try {
			RiceFlourInfo result = (RiceFlourInfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RiceFlourInfo instance) {
		log.debug("attaching dirty RiceFlourInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RiceFlourInfo instance) {
		log.debug("attaching clean RiceFlourInfo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}