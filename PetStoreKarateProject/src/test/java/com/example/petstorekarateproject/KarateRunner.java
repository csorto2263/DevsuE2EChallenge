package com.example.test;

import com.intuit.karate.junit4.Karate;

public class KarateRunner {
    @Karate.Test
    public <Karate> Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}
