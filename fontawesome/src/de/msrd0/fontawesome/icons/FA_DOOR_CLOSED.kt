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

/** Door Closed */
object FA_DOOR_CLOSED: Icon {
	
	override val name get() = "Door Closed"
	
	override val unicode get() = "f52a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M560 448H480V50.75C480 22.75 458.5 0 432 0h-288C117.5 0 96 22.75 96 50.75V448H16C7.125 448 0 455.1 0 464v32C0 504.9 7.125 512 16 512h544c8.875 0 16-7.125 16-16v-32C576 455.1 568.9 448 560 448zM384 288c-17.62 0-32-14.38-32-32s14.38-32 32-32s32 14.38 32 32S401.6 288 384 288z"/></svg>"""
		else -> null
	}
	
}
