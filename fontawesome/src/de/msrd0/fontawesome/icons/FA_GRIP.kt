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

/** Grip */
object FA_GRIP: Icon {
	
	override val name get() = "Grip"
	
	override val unicode get() = "f58d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M128 184C128 206.1 110.1 224 88 224H40C17.91 224 0 206.1 0 184V136C0 113.9 17.91 96 40 96H88C110.1 96 128 113.9 128 136V184zM128 376C128 398.1 110.1 416 88 416H40C17.91 416 0 398.1 0 376V328C0 305.9 17.91 288 40 288H88C110.1 288 128 305.9 128 328V376zM160 136C160 113.9 177.9 96 200 96H248C270.1 96 288 113.9 288 136V184C288 206.1 270.1 224 248 224H200C177.9 224 160 206.1 160 184V136zM288 376C288 398.1 270.1 416 248 416H200C177.9 416 160 398.1 160 376V328C160 305.9 177.9 288 200 288H248C270.1 288 288 305.9 288 328V376zM320 136C320 113.9 337.9 96 360 96H408C430.1 96 448 113.9 448 136V184C448 206.1 430.1 224 408 224H360C337.9 224 320 206.1 320 184V136zM448 376C448 398.1 430.1 416 408 416H360C337.9 416 320 398.1 320 376V328C320 305.9 337.9 288 360 288H408C430.1 288 448 305.9 448 328V376z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_GRIP]. */
val FA_GRIP_HORIZONTAL = FA_GRIP
