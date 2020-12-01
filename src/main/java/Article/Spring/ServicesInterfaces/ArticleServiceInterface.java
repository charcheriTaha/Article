package Article.Spring.ServicesInterfaces;

import java.util.List;

import Article.Spring.Entities.Article;

public interface ArticleServiceInterface {
	public Article findArticle(long id);
	public Article getArticleById(long id);
	public void saveArticle(Article article);
	public void updateArticle(Article article);
	public void deleteArticle(Article article);
	//public List<Article> articlesList();
	public Article findArticleByLibelle(String libelle);
	public void deleteArticleById(long id);
	public List<Article> getArticleByPrix(float prix);
	public List<Article> getArticleByEtat(String etat);
	public List<Article> findAll();
	
}
