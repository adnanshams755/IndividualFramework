package search;

import base.CommonAPI;

public class SearchPage extends CommonAPI{

    public void searchMenu(){
        typeOnElementNEnter("#global-nav-search","cancer");
        navigateBack();
        typeOnElementNEnter("#global-nav-search","fever");
        navigateBack();
        typeOnElementNEnter("#global-nav-search","obesity");

    }
}
