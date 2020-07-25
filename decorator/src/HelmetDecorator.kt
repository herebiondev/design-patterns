class HelmetDecorator(enemy: Enemy) : EnemyDecorator(enemy) {
    override fun takeDamage(): Double {
        return this.enemy.takeDamage() /2
    }
}