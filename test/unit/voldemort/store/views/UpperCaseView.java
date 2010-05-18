package voldemort.store.views;

import voldemort.store.Store;

/**
 * A simple test view that translates all reads into uppercase
 * 
 * 
 */
public class UpperCaseView implements View<String, String, String, String> {

    public String storeToView(Store<String, String> store, String k, String s, String t) {
        return s.toUpperCase();
    }

    public String viewToStore(Store<String, String> store, String k, String v, String t) {
        throw new UnsupportedViewOperationException("View not writable");
    }

}
