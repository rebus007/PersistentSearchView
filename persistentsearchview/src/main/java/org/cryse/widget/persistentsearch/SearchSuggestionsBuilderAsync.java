package org.cryse.widget.persistentsearch;

import java.util.Collection;

/**
 * Created by raphaelbussa on 18/01/17.
 */

public interface SearchSuggestionsBuilderAsync {

    Collection<SearchItem> buildEmptySearchSuggestion(int maxCount);
    void buildSearchSuggestionAsync(int maxCount, String query, SearchSuggestionsAsync searchSuggestionsAsync);

    public interface SearchSuggestionsAsync {
        void buildSearchSuggestion(Collection<SearchItem> suggestions, boolean clearSuggestions);
    }

}
