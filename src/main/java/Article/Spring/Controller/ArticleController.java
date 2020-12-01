package Article.Spring.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import Article.Spring.Entities.Article;
import Article.Spring.Services.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@RequestMapping(value = "/addArticle", method = RequestMethod.POST)
	public String articleSave(@RequestParam String libelle, @RequestParam float prix, @RequestParam int quantite,
			@RequestParam String etat) {
		Article art = new Article(libelle, prix, quantite, etat);
		articleService.saveArticle(art);
		return "article enregistré";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listArticle() {
		return articleService.findAll().toString();
	}

	@GetMapping("/getArticle/{id}")
	public Optional<Article> getArticleById(@PathVariable(value = "id") String artIdStr) {
		int artId = Integer.parseInt(artIdStr);
		return articleService.findById(artId);

	}

	@RequestMapping(value = "/updateArticle/{id}", method = RequestMethod.GET)
	public String articleUpdate(@RequestParam String libelle, @RequestParam float prix, @RequestParam int quantite,
			@RequestParam String etat) {
		Article art = new Article();
		art.setLibelle(libelle);
		art.setPrix(prix);
		art.setQuantite(quantite);
		art.setEtat(etat);
		articleService.saveArticle(art);
		return "article mis à jour";
	}
	

	@RequestMapping(value="/deleteArticle/{id}",method = RequestMethod.DELETE)
	public String deleteTaches(@PathVariable(value = "id") long id) {
		articleService.deleteArticleById(id);
		return "article suprimer!!";
	}

}
