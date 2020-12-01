package Article.Spring.Services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import Article.Spring.Entities.Article;
import Article.Spring.Repositories.ArticleRepository;
import Article.Spring.ServicesInterfaces.ArticleServiceInterface;

@Transactional
@Service("articleService")
public class ArticleService implements ArticleServiceInterface {
    @Autowired ArticleRepository articleRepository ;
	@Override
	public Article findArticle(long id) {
		// TODO Auto-generated method stub
		return articleRepository.findById(id);
	}

	@Override
	public void saveArticle(Article article) {
		// TODO Auto-generated method stub
		 articleRepository.save(article);
		
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteArticle(Article article) {
		// TODO Auto-generated method stub
		articleRepository.delete(article);
	}

	///***
	public List<Article> findAll(){
		List<Article> articles = new ArrayList<Article>();
		for ( Article article : articleRepository.findAll() ) {
			 articles.add(article);
		}
		return articles ;
	}

	@Override
	public Article findArticleByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return (Article) articleRepository.findByLibelle(libelle);
	}

	@Override
	public List<Article> getArticleByPrix(float prix) {
		// TODO Auto-generated method stub
		return articleRepository.findByPrix(prix);
	}

	@Override
	public List<Article> getArticleByEtat(String etat) {
		// TODO Auto-generated method stub
		return articleRepository.findByEtat(etat);
	}

	@Override
	public void deleteArticleById(long id) {
		// TODO Auto-generated method stub
		articleRepository.deleteById(id);
	}

	@Override
	public Article getArticleById(long id) {
		// TODO Auto-generated method stub
		return articleRepository.findById(id);
	}

	public Optional<Article> findById(int artId) {
		// TODO Auto-generated method stub
		return Optional.of(articleRepository.findById(artId));
	}

}
