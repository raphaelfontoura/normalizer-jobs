package core.enums;

public enum NormalizedJobsEnum {
    ARCHITECT {
        @Override
        public String toString() {
            return "Architect";
        }
    },
    ENGINEER {
        @Override
        public String toString() {
            return "Software engineer";
        }
    },
    SURVEYOR {
        @Override
        public String toString() {
            return "Quantity surveyor";
        }
    },
    ACCOUNTANT {
        @Override
        public String toString() {
            return "Accountant";
        }
    }
}
