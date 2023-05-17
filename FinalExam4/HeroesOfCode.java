package FinalExam4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heroesNumber = Integer.parseInt(scanner.nextLine());

        Map<String, int[]> heroInfo = new LinkedHashMap<>();

        for (int i = 0; i < heroesNumber; i++) {
            String[] input = scanner.nextLine().split(" ");
            heroInfo.put(input[0], new int[2]);
            heroInfo.get(input[0])[0] = Integer.parseInt(input[1]);
            heroInfo.get(input[0])[1] = Integer.parseInt(input[2]);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] command = input.split(" - ");

            String heroName;
            int manaNeeded;
            String spellName;
            int damage;
            String attacker;
            int amount;

            switch (command[0]) {
                case "CastSpell":
                    heroName = command[1];
                    manaNeeded = Integer.parseInt(command[2]);
                    spellName = command[3];

                    if (heroInfo.get(heroName)[1] >= manaNeeded) {
                        int manaLeft = heroInfo.get(heroName)[1] - manaNeeded;
                        heroInfo.get(heroName)[1] = manaLeft;
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName, manaLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                    }
                    break;
                case "TakeDamage":
                    heroName = command[1];
                    damage = Integer.parseInt(command[2]);
                    attacker = command[3];

                    if (heroInfo.get(heroName)[0] > damage) {
                        int healthPointsLeft = heroInfo.get(heroName)[0] - damage;
                        heroInfo.get(heroName)[0] = healthPointsLeft;
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,attacker,
                                healthPointsLeft);
                    } else {
                        heroInfo.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                    }
                    break;
                case "Recharge":
                    heroName = command[1];
                    amount = Integer.parseInt(command[2]);

                    if (heroInfo.get(heroName)[1] + amount > 200) {
                        int manaRechargedWith = 200 - heroInfo.get(heroName)[1];
                        heroInfo.get(heroName)[1] = 200;
                        System.out.printf("%s recharged for %d MP!%n",heroName,manaRechargedWith);
                    } else {
                        heroInfo.get(heroName)[1] += amount;
                        System.out.printf("%s recharged for %d MP!%n",heroName,amount);
                    }
                    break;
                case "Heal":
                    heroName = command[1];
                    amount = Integer.parseInt(command[2]);

                    if (heroInfo.get(heroName)[0] + amount > 100) {
                        int healthRechargedWith = 100 - heroInfo.get(heroName)[0];
                        heroInfo.get(heroName)[0] = 100;
                        System.out.printf("%s healed for %d HP!%n",heroName,healthRechargedWith);
                    } else {
                        heroInfo.get(heroName)[0] += amount;
                        System.out.printf("%s healed for %d HP!%n",heroName,amount);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, int[]> entry : heroInfo.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(" HP: "+entry.getValue()[0]);
            System.out.println(" MP: "+entry.getValue()[1]);
        }

    }
}