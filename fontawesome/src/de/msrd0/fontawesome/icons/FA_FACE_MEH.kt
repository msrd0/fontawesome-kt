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
import de.msrd0.fontawesome.Style.REGULAR

/** Face meh */
object FA_FACE_MEH: Icon {
	
	override val name get() = "Face meh"
	
	override val unicode get() = "f11a"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM176.4 240C194 240 208.4 225.7 208.4 208C208.4 190.3 194 176 176.4 176C158.7 176 144.4 190.3 144.4 208C144.4 225.7 158.7 240 176.4 240zM336.4 176C318.7 176 304.4 190.3 304.4 208C304.4 225.7 318.7 240 336.4 240C354 240 368.4 225.7 368.4 208C368.4 190.3 354 176 336.4 176zM160 336C151.2 336 144 343.2 144 352C144 360.8 151.2 368 160 368H352C360.8 368 368 360.8 368 352C368 343.2 360.8 336 352 336H160z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M144.4 208C144.4 190.3 158.7 176 176.4 176C194 176 208.4 190.3 208.4 208C208.4 225.7 194 240 176.4 240C158.7 240 144.4 225.7 144.4 208zM368.4 208C368.4 225.7 354 240 336.4 240C318.7 240 304.4 225.7 304.4 208C304.4 190.3 318.7 176 336.4 176C354 176 368.4 190.3 368.4 208zM328 328C341.3 328 352 338.7 352 352C352 365.3 341.3 376 328 376H184C170.7 376 160 365.3 160 352C160 338.7 170.7 328 184 328H328zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_MEH]. */
val FA_MEH = FA_FACE_MEH
