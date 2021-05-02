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
import de.msrd0.fontawesome.Style.BRANDS

object FA_STUMBLEUPON_LOGO: Icon {
	
	override val name get() = "StumbleUpon Logo"
	
	override val unicode get() = "f1a4"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M502.9 266v69.7c0 62.1-50.3 112.4-112.4 112.4-61.8 0-112.4-49.8-112.4-111.3v-70.2l34.3 16 51.1-15.2V338c0 14.7 12 26.5 26.7 26.5S417 352.7 417 338v-72h85.9zm-224.7-58.2l34.3 16 51.1-15.2V173c0-60.5-51.1-109-112.1-109-60.8 0-112.1 48.2-112.1 108.2v162.4c0 14.9-12 26.7-26.7 26.7S86 349.5 86 334.6V266H0v69.7C0 397.7 50.3 448 112.4 448c61.6 0 112.4-49.5 112.4-110.8V176.9c0-14.7 12-26.7 26.7-26.7s26.7 12 26.7 26.7v30.9z"/></svg>"""
		else -> null
	}
	
}
