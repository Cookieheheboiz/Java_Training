package com.vti.entity;

public class Car {
    private String name;
    private String type;

    public Car(String _name, String _type) {
        this.name = _name;
        this.type = _type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public class Engine {
        private String engineType;

        public Engine(String _engineType) {
            this.engineType = _engineType;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }


    }

}
