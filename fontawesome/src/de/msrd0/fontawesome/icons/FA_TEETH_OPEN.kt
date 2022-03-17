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

object FA_TEETH_OPEN: Icon {
	
	override val name get() = "Teeth Open"
	
	override val unicode get() = "f62f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M512 288H64c-35.35 0-64 28.65-64 64v32c0 53.02 42.98 96 96 96h384c53.02 0 96-42.98 96-96v-32C576 316.7 547.3 288 512 288zM144 368C144 394.5 122.5 416 96 416s-48-21.5-48-48v-32C48 327.1 55.13 320 64 320h64c8.875 0 16 7.125 16 16V368zM272 368C272 394.5 250.5 416 224 416s-48-21.5-48-48v-32C176 327.1 183.1 320 192 320h64c8.875 0 16 7.125 16 16V368zM400 368c0 26.5-21.5 48-48 48s-48-21.5-48-48v-32c0-8.875 7.125-16 16-16h64c8.875 0 16 7.125 16 16V368zM528 368c0 26.5-21.5 48-48 48s-48-21.5-48-48v-32c0-8.875 7.125-16 16-16h64c8.875 0 16 7.125 16 16V368zM480 32H96C42.98 32 0 74.98 0 128v64c0 35.35 28.65 64 64 64h448c35.35 0 64-28.65 64-64V128C576 74.98 533 32 480 32zM144 208C144 216.9 136.9 224 128 224H64C55.13 224 48 216.9 48 208v-32C48 149.5 69.5 128 96 128s48 21.5 48 48V208zM272 210.3C272 217.9 265.9 224 258.3 224H189.7C182.1 224 176 217.9 176 210.3V144C176 117.5 197.5 96 224 96s48 21.54 48 48V210.3zM400 210.3C400 217.9 393.9 224 386.3 224h-68.57C310.1 224 304 217.9 304 210.3V144C304 117.5 325.5 96 352 96s48 21.54 48 48V210.3zM528 208C528 216.9 520.9 224 512 224h-64c-8.875 0-16-7.125-16-16v-32C432 149.5 453.5 128 480 128s48 21.5 48 48V208z"/></svg>"""
		else -> null
	}
	
}
