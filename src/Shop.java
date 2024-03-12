public class Shop {
    public void buyNewCharacter(Player player,Character character){
        Player buyer = player;
        Character buyingCharacter= character;

        if (buyingCharacter instanceof Knight){
            int income= (int) ((int) buyer.getKnight().getPrice()*0.90);
            int expense= buyingCharacter.getPrice();

            buyer.changeGold(income-expense);

            buyer.setKnight((Knight) buyingCharacter);
        }

        if (buyingCharacter instanceof Archer){
            int income = (int) ((int) buyer.getArcher().getPrice() * 0.90);
              int expense = buyingCharacter.getPrice();

            buyer.changeGold(income - expense);

            buyer.setArcher((Archer) buyingCharacter);
        }

        if (buyingCharacter instanceof Mage){
            int income = (int) ((int) buyer.getMage().getPrice() * 0.90);
            int expense = buyingCharacter.getPrice();

            buyer.changeGold(income - expense);

            buyer.setMage((Mage) buyingCharacter);
        }

        if (buyingCharacter instanceof Healer){
            int income = (int) ((int) buyer.getHealer().getPrice() * 0.90);
            int expense = buyingCharacter.getPrice();

            buyer.changeGold(income - expense);

            buyer.setHealer((Healer) buyingCharacter);
        }

        if (buyingCharacter instanceof MythicalCreature){
            int income = (int) ((int) buyer.getMythicalCreature().getPrice() * 0.90);
            int expense = buyingCharacter.getPrice();

            buyer.changeGold(income - expense);

            buyer.setMythicalCreature((MythicalCreature) buyingCharacter);
        }
    }

    public void buyArmour(Player player,Character character,Armour armour){
        player.changeGold(armour.getPrice());
        character.setArmour(armour);
    }

    public void buyArtefact(Player player, Character character,Artefact artefact){
        player.changeGold(artefact.getPrice());
        character.setArtefact(artefact);
    }


}
