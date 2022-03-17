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

object FA_W: Icon {
	
	override val name get() = "W"
	
	override val unicode get() = "57"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M573.1 75.25l-144 384c-4.703 12.53-16.67 20.77-29.95 20.77c-.4062 0-.8125 0-1.219-.0156c-13.77-.5156-25.66-9.797-29.52-23.03L288 178.3l-81.28 278.7c-3.859 13.23-15.75 22.52-29.52 23.03c-13.75 .4687-26.33-7.844-31.17-20.75l-144-384c-6.203-16.55 2.188-34.98 18.73-41.2C37.31 27.92 55.75 36.23 61.97 52.78l110.2 293.1l85.08-291.7C261.3 41.41 273.8 32.01 288 32.01s26.73 9.396 30.72 23.05l85.08 291.7l110.2-293.1c6.219-16.55 24.67-24.86 41.2-18.73C571.8 40.26 580.2 58.7 573.1 75.25z"/></svg>"""
		else -> null
	}
	
}
