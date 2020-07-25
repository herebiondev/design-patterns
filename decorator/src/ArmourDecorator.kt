class ArmourDecorator(enemy: Enemy) : EnemyDecorator(enemy) {
    override fun takeDamage(): Double {
        return this.enemy.takeDamage() /1.5
    }
}