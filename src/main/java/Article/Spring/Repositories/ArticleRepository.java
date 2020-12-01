package Article.Spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import Article.Spring.Entities.Article;


@Repository("articleRepository")
public interface ArticleRepository extends CrudRepository<Article,Long>{
	
public Article findById (long id );
public List <Article> findByLibelle (String libelle );
public List <Article> findByEtat (String etat );
public List <Article> findByPrix (float prix );





}
