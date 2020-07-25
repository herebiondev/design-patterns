fun main(Args: Array<String>){
    var enemy = BaseEnemy()
    var enemyWithHelmet = HelmetDecorator(enemy)

    var enemyWithHelmetAndArmour = ArmourDecorator(enemyWithHelmet)

    var computedDamaged = enemyWithHelmetAndArmour.takeDamage()
    println(computedDamaged)
}