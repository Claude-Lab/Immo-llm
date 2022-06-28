package fr.lusseau.llm.domain.exception;

/**
 * @author Claude LUSSEAU
 * @project Immo-LLM
 * @date 04 30, 2022 | 19:58
 */
public class EmailNotExistException extends Throwable {

    public EmailNotExistException(final String message) {
        super(message);
    }
}
