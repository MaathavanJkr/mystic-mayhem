public class Shop {
    public void buyNewCharacter(Player player,Character character){
        Player buyer = player;
        Character buyingCharacter= character;

        if (buyingCharacter instanceof Knight){
            int income= round(buyer.getKnight().getPrice()*0.90);
            int expense= buyingCharacter.getPrice();

            buyer.changeGold(income-expense);

            buyer.setKnight((Knight) buyingCharacter);
        }

        if (buyingCharacter instanceof Archer){
            int income = round(buyer.getArcher().getPrice() * 0.90);
              int expense = buyingCharacter.getPrice();

            buyer.changeGold(income - expense);

            buyer.setArcher((Archer) buyingCharacter);
        }

        if (buyingCharacter instanceof Mage){
            int income = round(buyer.getMage().getPrice() * 0.90);
            int expense = buyingCharacter.getPrice();

            buyer.changeGold(income - expense);

            buyer.setMage((Mage) buyingCharacter);
        }

        if (buyingCharacter instanceof Healer){
            int income = round(buyer.getHealer().getPrice() * 0.90);
            int expense = buyingCharacter.getPrice();

            buyer.changeGold(income - expense);

            buyer.setHealer((Healer) buyingCharacter);
        }

        if (buyingCharacter instanceof MythicalCreature){
            int income = round(buyer.getMythicalCreature().getPrice() * 0.90);
            int expense = buyingCharacter.getPrice();

            buyer.changeGold(income - expense);

            buyer.setMythicalCreature((MythicalCreature) buyingCharacter);
        }
    }

    public void buyArmour(Player player,Character character,Armour armour){
        character.setArmour(armour);
        player.setGold(player.getGold() - armour.getPrice());
    }

    public void buyArtefact(Player player, Character character,Artefact artefact){
        character.setArtefact(artefact);
        player.setGold(player.getGold() - artefact.getPrice());
    }

    public static int round(double value){
        return (int) Math.round(value);
    }
}
