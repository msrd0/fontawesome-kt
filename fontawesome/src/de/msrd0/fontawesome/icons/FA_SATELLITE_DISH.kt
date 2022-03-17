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

/** Satellite Dish */
object FA_SATELLITE_DISH: Icon {
	
	override val name get() = "Satellite Dish"
	
	override val unicode get() = "f7c0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M216 104C202.8 104 192 114.8 192 128s10.75 24 24 24c79.41 0 144 64.59 144 144C360 309.3 370.8 320 384 320s24-10.75 24-24C408 190.1 321.9 104 216 104zM224 0C206.3 0 192 14.31 192 32s14.33 32 32 32c123.5 0 224 100.5 224 224c0 17.69 14.33 32 32 32s32-14.31 32-32C512 129.2 382.8 0 224 0zM188.9 346l27.37-27.37c2.625 .625 5.059 1.506 7.809 1.506c17.75 0 31.99-14.26 31.99-32c0-17.62-14.24-32.01-31.99-32.01c-17.62 0-31.99 14.38-31.99 32.01c0 2.875 .8099 5.25 1.56 7.875L166.2 323.4L49.37 206.5c-7.25-7.25-20.12-6-24.1 3c-41.75 77.88-29.88 176.7 35.75 242.4c65.62 65.62 164.6 77.5 242.4 35.75c9.125-5 10.38-17.75 3-25L188.9 346z"/></svg>"""
		else -> null
	}
	
}
