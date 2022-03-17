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

object FA_UNIVERSAL_ACCESS: Icon {
	
	override val name get() = "Universal Access"
	
	override val unicode get() = "f29a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 0C114.6 0 0 114.6 0 256c0 141.4 114.6 256 256 256s256-114.6 256-256C512 114.6 397.4 0 256 0zM256 80c22.09 0 40 17.91 40 40S278.1 160 256 160S216 142.1 216 120S233.9 80 256 80zM374.6 215.1L315.3 232C311.6 233.1 307.8 233.6 304 234.4v62.32l30.64 87.34c4.391 12.5-2.188 26.19-14.69 30.59C317.3 415.6 314.6 416 312 416c-9.906 0-19.19-6.188-22.64-16.06l-25.85-70.65c-2.562-7.002-12.46-7.002-15.03 0l-25.85 70.65C219.2 409.8 209.9 416 200 416c-2.641 0-5.312-.4375-7.953-1.344c-12.5-4.406-19.08-18.09-14.69-30.59L208 296.7V234.4C204.2 233.6 200.4 233.1 196.7 232L137.4 215.1C124.7 211.4 117.3 198.2 120.9 185.4S137.9 165.2 150.6 168.9l59.25 16.94c30.17 8.623 62.15 8.623 92.31 0l59.25-16.94c12.7-3.781 26.02 3.719 29.67 16.47C394.7 198.2 387.3 211.4 374.6 215.1z"/></svg>"""
		else -> null
	}
	
}
