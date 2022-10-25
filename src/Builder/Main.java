package Builder;

import Builder.HttpClient.HttpClientBuilder;

public class Main {
    /*
     * Creational Patterns
     * Builder pattern aims to “Separate the construction 
     * of a complex object from its representation so that 
     * the same construction process can create different 
     * representations.” It is used to construct a complex 
     * object step by step and the final step will return 
     * the object. The process of constructing an object 
     * should be generic so that it can be used to create 
     * different representations of the same object.
     */
    public static void main(String[] args) {
        // This is not a very intuitive code
        // new HttpClient("GET", "http://test.com", null, null, null, null);
        
        // Builder pattern looks like this -
        HttpClientBuilder builder = new HttpClient.HttpClientBuilder();
        HttpClient httpClient = builder.method("POST").url("http://test.com").body("{}").build();
        System.out.println(httpClient);
    }
}
