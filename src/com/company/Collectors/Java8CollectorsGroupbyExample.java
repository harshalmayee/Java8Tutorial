package com.company.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8CollectorsGroupbyExample {
    public static void main(String[] args) {
      List<Country> countries = createCountryList();

      // Group By CountryName
        Map<String,List<Country>>  groupByCountry = countries
                .stream()
                .collect(Collectors.groupingBy(Country::getCountryName));
        System.out.println(groupByCountry.get("India"));
      // Group By CountryName and calculate Count
        Map<String,Long> counting = countries
                .stream()
                .collect(Collectors.groupingBy(Country::getCountryName,Collectors.counting()));
        System.out.println(counting);
        // Grouping by country name and sum up population
        Map<String,Long> populationCount = countries
                .stream()
                .collect(Collectors.groupingBy(Country::getCountryName,Collectors.summingLong(Country::getPopulation)));
        System.out.println(populationCount);

    }

    public static List<Country> createCountryList(){
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("India",20000));
        countryList.add(new Country("China",40000));
        countryList.add(new Country("Nepal",30000));
        countryList.add(new Country("India",50000));
        countryList.add(new Country("China",10000));
        return countryList;
    }
}
