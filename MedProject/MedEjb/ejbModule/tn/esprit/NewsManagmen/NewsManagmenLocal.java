package tn.esprit.NewsManagmen;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.News;

@Local
public interface NewsManagmenLocal {
	Boolean addNews (News news);
	Boolean upDateNews (News news);
	Boolean deleteNews (News news);
	News findNewsById( Integer id);
	List<News> findAllNews();
}
