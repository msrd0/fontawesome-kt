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

object FA_PARACHUTE_BOX: Icon {
	
	override val name get() = "Parachute Box"
	
	override val unicode get() = "f4cd"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M272 192V320H304C311 320 317.7 321.5 323.7 324.2L443.8 192H415.5C415.8 186.7 416 181.4 416 176C416 112.1 393.8 54.84 358.9 16.69C450 49.27 493.4 122.6 507.8 173.6C510.5 183.1 502.1 192 493.1 192H487.1L346.8 346.3C350.1 352.8 352 360.2 352 368V464C352 490.5 330.5 512 304 512H207.1C181.5 512 159.1 490.5 159.1 464V368C159.1 360.2 161.9 352.8 165.2 346.3L24.92 192H18.89C9 192 1.483 183.1 4.181 173.6C18.64 122.6 61.97 49.27 153.1 16.69C118.2 54.84 96 112.1 96 176C96 181.4 96.16 186.7 96.47 192H68.17L188.3 324.2C194.3 321.5 200.1 320 207.1 320H239.1V192H128.5C128.2 186.7 127.1 181.4 127.1 176C127.1 125 143.9 80.01 168.2 48.43C192.5 16.89 223.8 0 255.1 0C288.2 0 319.5 16.89 343.8 48.43C368.1 80.01 384 125 384 176C384 181.4 383.8 186.7 383.5 192H272z"/></svg>"""
		else -> null
	}
	
}
