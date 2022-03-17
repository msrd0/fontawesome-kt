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

/** Envelopes bulk */
object FA_ENVELOPES_BULK: Icon {
	
	override val name get() = "Envelopes bulk"
	
	override val unicode get() = "f674"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M191.9 448.6c-9.766 0-19.48-2.969-27.78-8.891L32 340.2V480c0 17.62 14.38 32 32 32h256c17.62 0 32-14.38 32-32v-139.8L220.2 439.5C211.7 445.6 201.8 448.6 191.9 448.6zM192 192c0-35.25 28.75-64 64-64h224V32c0-17.62-14.38-32-32-32H128C110.4 0 96 14.38 96 32v192h96V192zM320 256H64C46.38 256 32 270.4 32 288v12.18l151 113.8c5.25 3.719 12.7 3.734 18.27-.25L352 300.2V288C352 270.4 337.6 256 320 256zM576 160H256C238.4 160 224 174.4 224 192v32h96c33.25 0 60.63 25.38 63.75 57.88L384 416h192c17.62 0 32-14.38 32-32V192C608 174.4 593.6 160 576 160zM544 288h-64V224h64V288z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_ENVELOPES_BULK]. */
val FA_MAIL_BULK = FA_ENVELOPES_BULK
