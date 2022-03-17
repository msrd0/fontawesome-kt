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

/** Teeth */
object FA_TEETH: Icon {
	
	override val name get() = "Teeth"
	
	override val unicode get() = "f62e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M480 32H96C42.98 32 0 74.98 0 128v256c0 53.02 42.98 96 96 96h384c53.02 0 96-42.98 96-96V128C576 74.98 533 32 480 32zM144 336C144 362.5 122.5 384 96 384s-48-21.5-48-48v-32C48 295.1 55.13 288 64 288h64c8.875 0 16 7.125 16 16V336zM144 240C144 248.9 136.9 256 128 256H64C55.13 256 48 248.9 48 240v-32C48 181.5 69.5 160 96 160s48 21.5 48 48V240zM272 336C272 362.5 250.5 384 224 384s-48-21.5-48-48v-32C176 295.1 183.1 288 192 288h64c8.875 0 16 7.125 16 16V336zM272 242.3C272 249.9 265.9 256 258.3 256H189.7C182.1 256 176 249.9 176 242.3V176C176 149.5 197.5 128 224 128s48 21.54 48 48V242.3zM400 336c0 26.5-21.5 48-48 48s-48-21.5-48-48v-32C304 295.1 311.1 288 320 288h64c8.875 0 16 7.125 16 16V336zM400 242.3C400 249.9 393.9 256 386.3 256h-68.57C310.1 256 304 249.9 304 242.3V176C304 149.5 325.5 128 352 128s48 21.54 48 48V242.3zM528 336c0 26.5-21.5 48-48 48s-48-21.5-48-48v-32C432 295.1 439.1 288 448 288h64c8.875 0 16 7.125 16 16V336zM528 240C528 248.9 520.9 256 512 256h-64c-8.875 0-16-7.125-16-16v-32C432 181.5 453.5 160 480 160s48 21.5 48 48V240z"/></svg>"""
		else -> null
	}
	
}
