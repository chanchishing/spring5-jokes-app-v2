package guru.springframework.sping5jokesapp.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class NorisJokeService implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public NorisJokeService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String sayJoke() {
        return chuckNorrisQuotes.getRandomQuote();

    }

}
