package javaders.day38enumsiterators;

public class EnumRunner {


        public static void main(String[] args) {

            String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();

            System.out.println(capitalOfIllinois);


            UsStatesEnum state = UsStatesEnum.ALASKA;
            System.out.println(state);

            String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
            System.out.println(stateName);

            String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
            System.out.println(abbreviationOfAlaska);

        }
}
