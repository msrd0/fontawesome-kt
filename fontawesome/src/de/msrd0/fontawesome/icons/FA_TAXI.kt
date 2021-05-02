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

object FA_TAXI: Icon {
	
	override val name get() = "Taxi"
	
	override val unicode get() = "f1ba"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M462 241.64l-22-84.84c-9.6-35.2-41.6-60.8-76.8-60.8H352V64c0-17.67-14.33-32-32-32H192c-17.67 0-32 14.33-32 32v32h-11.2c-35.2 0-67.2 25.6-76.8 60.8l-22 84.84C21.41 248.04 0 273.47 0 304v48c0 23.63 12.95 44.04 32 55.12V448c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32v-32h256v32c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32v-40.88c19.05-11.09 32-31.5 32-55.12v-48c0-30.53-21.41-55.96-50-62.36zM96 352c-17.67 0-32-14.33-32-32s14.33-32 32-32 32 14.33 32 32-14.33 32-32 32zm20.55-112l17.2-66.36c2.23-8.16 9.59-13.64 15.06-13.64h214.4c5.47 0 12.83 5.48 14.85 12.86L395.45 240h-278.9zM416 352c-17.67 0-32-14.33-32-32s14.33-32 32-32 32 14.33 32 32-14.33 32-32 32z"/></svg>"""
		else -> null
	}
	
}
