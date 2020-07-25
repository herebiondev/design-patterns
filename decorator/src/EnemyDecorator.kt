abstract class EnemyDecorator: Enemy {
    protected var enemy: Enemy

    constructor(enemy: Enemy){
        this.enemy = enemy
    }

    override fun takeDamage(): Double {
        return this.enemy.takeDamage()
    }
}