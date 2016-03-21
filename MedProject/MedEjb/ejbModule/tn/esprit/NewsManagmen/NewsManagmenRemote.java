package tn.esprit.NewsManagmen;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.News;

@Remote
public interface NewsManagmenRemote {
	Boolean addNews (News news);
	Boolean upDateNews (News news);
	Boolean deleteNews (News news);
	News findNewsById( Integer id);
	List<News> findAllNews();
}
