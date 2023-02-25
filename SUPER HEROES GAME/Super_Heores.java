package lab_assignment1;
import java.util.Scanner;
//Abstract class called SuperHero
abstract class SuperHero
{
String Hero_Name;
String Real_Name;
String Hero_Occupation;
String Hero_Description;
int Hero_Age;
boolean Can_Fly;
//Constructor with no parameters
SuperHero()
{
Hero_Name="Nill";
Real_Name="Nill";
Hero_Occupation="Nill";
Hero_Description="Nill";
Hero_Age=-1;
Can_Fly=false;
}
//COnstructor with required parameters
SuperHero(String HeroName, String RealName, String Occupation, String Description, int Age, boolean Fly)
{
this.Hero_Name=HeroName;
this.Real_Name=RealName;
this.Hero_Occupation=Occupation;
this.Hero_Description=Description;
this.Hero_Age=Age;
this.Can_Fly=Fly;
}
//To String method to display all the values
public String toString()
{
return "\nHeroName :"+Hero_Name+"\nRealName: "+Real_Name+"\nOcc: "+Hero_Occupation+"\nDescription: "+Hero_Description+"\nAge: "+Hero_Age+"\nFly: "+Can_Fly+"\n";
}
//attack and rest methods
abstract void Attack(String name);
abstract void Rest();
}
//PhysicalHero extended class of parent called SuperHero
class PhysicalHero extends SuperHero
{
int Hero_strength;
PhysicalHero()
{
super();
Hero_strength=0;
}
PhysicalHero(String HeroName, String RealName, String Occupation, String Description, int Age, boolean Fly, int strength)
{
super(HeroName, RealName, Occupation, Description, Age, Fly);
this.Hero_strength=strength;
}
public String toString()
{
return "\nHero Name :"+Hero_Name+"\nReal Name: "+Real_Name+"\nOccupation: "+Hero_Occupation+"\nDescription: "+Hero_Description+"\nAge: "+Hero_Age+"\nCan Fly: "+Can_Fly+"\nStrength: "+Hero_strength+"%\n";
}
void Attack(String attck_nme)
{
int damage=0;
if(attck_nme=="Slap")
damage=100;
else if(attck_nme=="Fire Ball")
damage=180;
else if(attck_nme=="Sword")
damage=240;
else if(attck_nme=="Spell")
damage=500;
else if(attck_nme=="Arrow")
damage=700;
else if(attck_nme=="Solar rays")
damage=1000;
Hero_strength-=damage;
System.out.println("\n"+Hero_Name+ " used "+attck_nme);
System.out.println("Physical Strength decreased!\nPhysical Strength Is: "+Hero_strength);
}
void Rest()
{
Hero_strength+=10;
System.out.println("\n"+Hero_Name+" rested!\nPhysical Strength increased!\nPhysical Strength: "+Hero_strength);
}
}
class MageHero extends SuperHero
{
int mana_power;
MageHero()
{
super();
mana_power=-1;
}
MageHero(String HeroName, String RealName, String Occupation, String Description, int Age, boolean Fly, int mana)
{
super(HeroName, RealName, Occupation, Description, Age, Fly);
this.mana_power=mana;
}
public String toString()
{
return "\nHero Name :"+Hero_Name+"\nReal Name: "+Real_Name+"\nOccupation: "+Hero_Occupation+"\nDescription: "+Hero_Description+"\nAge: "+Hero_Age+"\nCan Fly: "+Can_Fly+"\nMana: "+mana_power+"\n";
}
void Attack(String attck_nme)
{
int pow=0;
if(attck_nme=="Electric shock")
pow=1000;
else if(attck_nme=="Poison")
pow=3500;
else if(attck_nme=="Bolt")
pow=500;
mana_power-=pow;
System.out.println("\n"+Hero_Name+ " used "+attck_nme);
System.out.println("Mana decreased!\nMana Capacity: "+mana_power);
}
void Rest()
{
mana_power+=5;
System.out.println("\n"+Hero_Name+" regained energy!\nMana increased!\nMana Capacity: "+mana_power);
}
}
class Vigilante extends SuperHero
{
String Weapon;
Vigilante()
{
super();
Weapon="Nill";
}
Vigilante(String HeroName, String RealName, String Occupation, String Description, int Age, boolean Fly, String Weapon)
{
super(HeroName, RealName, Occupation, Description, Age, Fly);
this.Weapon=Weapon;
}
public String toString()
{
return "\nHero Name :"+Hero_Name+"\nReal Name: "+Real_Name+"\nOccupation: "+Hero_Occupation+"\nDescription: "+Hero_Description+"\nAge: "+Hero_Age+"\nCan Fly: "+Can_Fly+"\nWeapon: "+Weapon+"\n";
}
void Attack(String attck_nme)
{
System.out.println("\n"+Hero_Name+" used weapon: "+attck_nme);
}
void Rest() {
System.out.println("\nIn rest "+Hero_Name+" Reloaded his "+Weapon);
}
}
class Speedster extends PhysicalHero
{
int Hero_speed;
int Hero_calorie;
Speedster(String HName, String RName, String Occ, String Des, int Age, boolean Fly, int str, int speed, int calorie)
{
super(HName, RName, Occ, Des, Age, Fly, str);
this.Hero_speed=speed;
this.Hero_calorie=calorie;
}
public String toString()
{
return "\nHero Name :"+Hero_Name+"\nReal Name: "+Real_Name+"\nOccupation: "+Hero_Occupation+"\nDescription: "+Hero_Description+"\nAge: "+Hero_Age+"\nCan Fly: "+Can_Fly+"\nStrength: "+Hero_strength+"%"+"\nSpeed: "+Hero_speed+"\nCalorie Intake: "+Hero_calorie+"\n";
}
}
public class Super_Heroes {
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
int choice;
boolean contt = true;
PhysicalHero phy_hero1=new PhysicalHero("Super Man","Stark Dent","Journalst","Stark Dent is a man with extra ordinary srength.\nHe can see through walls and has night vision.\nHe is also a very good singer",3000,true,6000);
PhysicalHero phy_hero2=new PhysicalHero("Flash","Jay Garrick","Professor","As the Flash, Garrick can run at superhuman speeds \nand has superhumanly-fast reflexes. The limits\n of his speed have fluctuated over the years, though he has\n usually been second to DC's \"flagship Flash\", Barry Allen",7000,true,60089);
MageHero meg_hero1=new MageHero("Vision","Android","Alien","The strengths of visions are advanced robotic systems and solar power \ncells. If the Vision wishes, he can convert \nthe solar energy into beams of infrared or microwave radiation",5346,true,2389);
MageHero meg_hero2=new MageHero("Invisible Hood","Art Pinajian","Detective","This super hero uses his magical coated jacket for\n invisibility and hence solve the crimes affactively",5346,false,60089);
Vigilante veg_hero1=new Vigilante("Doctor Occult","Richard","Investigator","Doctor Occult has the powers of astral projection,\n hypnosis, illusion creating, and telekinesis. \nHe wields a powerful talisman, a sphere or disc with a black \nand white pattern, called the Mystic Symbol of the Seven",5000,false,"Disc");
Vigilante veg_hero2=new Vigilante("Arrow","Ralph Phyne","Millitary Agent","The Arrow is actually Ralph Payne, a military intelligence\n agent who uses his archery skills to fight \ncrime. He delivers messages via arrow, both to criminals and \nthe police, and uses his bow to kill the evildoers",2000,false,"Archer");
Speedster sped_hero1=new Speedster("The Bolt","Larry Fallen","Plitical Party Leader","Lary is most popular poltician from Los Vegas\n He got his super speed during his recovery\n from a fall coming down the stairs during a speech.Larry uses\n his speed to keep political gatherings under control",5346,true,6089,1020,4540);
Speedster sped_hero2=new Speedster("Groot","Stan Lee","Monarch of Planet X tree","Groot can absorb wood as food, and has the ability \nto regenerate. Groot can control trees \nand plants, using them to attack others, and appears to be \nresistant to fire. Groot is able to sprout dramatically increasing mass",5346,false,60089,4540,50450);
do
{
System.out.println("1:DISPLAY HERO'S DATA");
System.out.println("2: DISPLAY ATTACK");
System.out.println("3: DISPLAY REST");
System.out.println("4: EXIT THE HERO WORLD");
System.out.println("\n\nEnter your choice---->");
choice=input.nextInt();
switch(choice)
{
case 1:
System.out.println(phy_hero1.toString());
System.out.println(phy_hero2.toString());
System.out.println(meg_hero1.toString());
System.out.println(meg_hero2.toString());
System.out.println(veg_hero1.toString());
System.out.println(veg_hero2.toString());
System.out.println(sped_hero1.toString());
System.out.println(sped_hero2.toString());
break;
case 2:
phy_hero1.Attack("Slap");
phy_hero2.Attack("Fire Ball");
meg_hero1.Attack("Electric shock");
meg_hero2.Attack("Poison");
veg_hero1.Attack("Magical Cloak");
veg_hero2.Attack("Arrow");
sped_hero1.Attack("Spell");
sped_hero2.Attack("Solar Rays");
break;
case 3:
phy_hero1.Rest();
phy_hero2.Rest();
meg_hero1.Rest();
meg_hero2.Rest();
veg_hero1.Rest();
veg_hero2.Rest();
break;
case 4:
System.out.println("Fight Ended");
contt=false;
}
}
while(contt);
}
}