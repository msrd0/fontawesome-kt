/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_DRUMSTICK_WITH_BITE_TAKEN_OUT: Icon {
	
	override val name get() = "Drumstick with Bite Taken Out"
	
	override val unicode get() = "f6d7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 168.9c0 1.766-.0229 3.398-.0768 5.164c-16.91-9.132-35.51-13.76-53.96-13.76c-82.65 0-105.5 74.17-105.5 105.4c0 27.04 9.923 54.43 29.63 76.25c-19.52 6.629-39.99 9.997-60.62 9.997l-87.18 .0038l-40.59 40.49c-6.104 6.103-8.921 14.01-8.921 22.17c0 13.98 7.244 17.1 7.244 37.03C192.1 485.4 164.6 512 131.7 512c-15.63 0-31.11-6.055-42.72-17.8c-11.55-11.46-16.82-26.31-16.82-41.26c0-4.948 .575-9.903 1.695-14.75c-4.842 1.11-9.793 1.681-14.72 1.681c-42.15 0-59.13-36.64-59.13-59.5c0-33.43 27.15-60.34 60.39-60.34c18.97 0 22.97 7.219 36.96 7.219c8.159 0 16.04-2.811 22.14-8.914l40.57-40.47L160.1 191.1c0-63.1 27.79-107 63.17-142.4c33.13-33.06 76.39-49.59 119.7-49.59s86.79 16.53 119.9 49.59C495.9 82.5 512 125.7 512 168.9z"/></svg>"""
		else -> null
	}
	
}
