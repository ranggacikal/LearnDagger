package ranggacikal.co.id.learndagger

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}