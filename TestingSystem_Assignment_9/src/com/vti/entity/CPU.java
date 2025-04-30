package com.vti.entity;

public class CPU {
    private double price;
    public CPU(double _price) {
        this.price = _price;
    }

    public class Processor {
        private int coreAmount;
        private String menufacturer;
        public Processor(int _coreAmount, String _menufacturer) {
            this.coreAmount = _coreAmount;
            this.menufacturer = _menufacturer;

        }

        public double getCache() {
            return 4.3;
        }



    }

    public class RAM {
        private int memory;
        private String menufacturer;
        public RAM(int _memory, String _menufacturer) {
            this.memory = _memory;
            this.menufacturer = _menufacturer;

        }

        public double getClockSpeed() {
            return 5.5;
        }
    }
}
