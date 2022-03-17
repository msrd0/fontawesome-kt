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

/** Face grin tongue */
object FA_FACE_GRIN_TONGUE: Icon {
	
	override val name get() = "Face grin tongue"
	
	override val unicode get() = "f589"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 0C397.4 0 512 114.6 512 256C512 368.9 438.9 464.7 337.5 498.8C346.7 484 352 466.6 352 448V401.1C376.3 383.5 395.6 359.5 407.4 331.5C412.4 319.7 400.4 309 388.1 312.8C348.4 324.9 303.7 331.8 256.3 331.8C208.9 331.8 164.1 324.9 124.5 312.8C112.2 309 100.2 319.7 105.2 331.5C116.9 359.3 135.1 383.1 160 400.7V448C160 466.6 165.3 484 174.5 498.8C73.07 464.7 0 368.9 0 256C0 114.6 114.6 .0003 256 .0003L256 0zM176.4 240C194 240 208.4 225.7 208.4 208C208.4 190.3 194 176 176.4 176C158.7 176 144.4 190.3 144.4 208C144.4 225.7 158.7 240 176.4 240zM336.4 176C318.7 176 304.4 190.3 304.4 208C304.4 225.7 318.7 240 336.4 240C354 240 368.4 225.7 368.4 208C368.4 190.3 354 176 336.4 176zM256 512C220.7 512 192 483.3 192 448V402.6C192 387.9 203.9 376 218.6 376H220.6C231.9 376 241.7 383.9 244.2 394.9C247 407.5 264.1 407.5 267.8 394.9C270.3 383.9 280.1 376 291.4 376H293.4C308.1 376 320 387.9 320 402.6V448C320 483.3 291.3 512 256 512V512z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M144.4 208C144.4 190.3 158.7 176 176.4 176C194 176 208.4 190.3 208.4 208C208.4 225.7 194 240 176.4 240C158.7 240 144.4 225.7 144.4 208zM368.4 208C368.4 225.7 354 240 336.4 240C318.7 240 304.4 225.7 304.4 208C304.4 190.3 318.7 176 336.4 176C354 176 368.4 190.3 368.4 208zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 337.7 95.13 408.4 163.7 442.4C161.3 434 160 425.2 160 416V363.6C151.1 355.6 143.3 346.5 136.9 336.5C126.5 320.4 143.7 303.1 162.3 308.4C191.3 315.1 222.8 318.8 255.9 318.8C289 318.8 320.6 315.1 349.5 308.4C368.2 303.1 385.4 320.4 374.1 336.5C368.6 346.4 360.8 355.5 352 363.5V416C352 425.2 350.7 434 348.3 442.4C416.9 408.4 464 337.7 464 256C464 141.1 370.9 48 255.1 48H256zM320 416V378.6C320 363.9 308.1 352 293.4 352H291.4C280.1 352 270.3 359.9 267.8 370.9C264.1 383.5 247 383.5 244.2 370.9C241.7 359.9 231.9 352 220.6 352H218.6C203.9 352 192 363.9 192 378.6V416C192 451.3 220.7 480 256 480C291.3 480 320 451.3 320 416z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_GRIN_TONGUE]. */
val FA_GRIN_TONGUE = FA_FACE_GRIN_TONGUE
