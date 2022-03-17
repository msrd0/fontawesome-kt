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

object FA_CAR_REAR: Icon {
	
	override val name get() = "Car rear"
	
	override val unicode get() = "f5de"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M165.4 32H346.6C387.4 32 423.7 57.78 437.2 96.29L472.4 196.8C495.6 206.4 512 229.3 512 256V336C512 359.7 499.1 380.4 480 391.4V448C480 465.7 465.7 480 448 480H416C398.3 480 384 465.7 384 448V400H128V448C128 465.7 113.7 480 96 480H64C46.33 480 32 465.7 32 448V391.4C12.87 380.4 0 359.7 0 336V256C0 229.3 16.36 206.4 39.61 196.8L74.8 96.29C88.27 57.78 124.6 32 165.4 32V32zM165.4 96C151.8 96 139.7 104.6 135.2 117.4L109.1 192H402.9L376.8 117.4C372.3 104.6 360.2 96 346.6 96H165.4zM208 272C199.2 272 192 279.2 192 288V320C192 328.8 199.2 336 208 336H304C312.8 336 320 328.8 320 320V288C320 279.2 312.8 272 304 272H208zM72 304H104C117.3 304 128 293.3 128 280C128 266.7 117.3 256 104 256H72C58.75 256 48 266.7 48 280C48 293.3 58.75 304 72 304zM408 256C394.7 256 384 266.7 384 280C384 293.3 394.7 304 408 304H440C453.3 304 464 293.3 464 280C464 266.7 453.3 256 440 256H408z"/></svg>"""
		else -> null
	}
	
}

val FA_CAR_ALT = FA_CAR_REAR
