package tn.esprit.NewsManagmen;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;





import tn.esprit.NewsManagmen.NewsManagmenLocal;
import tn.esprit.entities.News;

/**
 * Session Bean implementation class NewsManagement
 */
@Stateless
@LocalBean
public class NewsManagmen implements NewsManagmenLocal,NewsManagmenRemote {

	@PersistenceContext 
    EntityManager entityManager;
    public NewsManagmen() {
        // TODO Auto-generated constructor stub
    }
    public Boolean addNews(News news) {
		try {
			entityManager.persist(news);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public Boolean upDateNews(News news) {
		try {
			entityManager.merge(news);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public Boolean deleteNews(News news) {
		try {
			entityManager.remove(entityManager.merge(news));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public News findNewsById(Integer id) {
		News news=null;
		try {
			news=entityManager.find(News.class, id);
			
		} catch (Exception e) {
			
		}
		return news;
	}

	@Override
	public List<News> findAllNews() {
		return entityManager.createQuery("Select e from News e",
				News.class).getResultList();
	}
	

	
}
