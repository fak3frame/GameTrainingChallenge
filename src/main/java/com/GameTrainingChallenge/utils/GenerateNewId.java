package com.GameTrainingChallenge.utils;

import java.util.Set;

public class GenerateNewId {
    public static int createNewId(Set<Integer> ids){
        if(ids.isEmpty()){
            return 0;
        }
        else {
            Integer id = ids.stream()
                    .max(Integer::compare)
                    .get();
            return id+1;
        }
    }
}
