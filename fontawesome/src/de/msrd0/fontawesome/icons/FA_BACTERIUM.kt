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

object FA_BACTERIUM: Icon {
	
	override val name get() = "Bacterium"
	
	override val unicode get() = "e05a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M543 102.9c-3.711-12.51-16.92-19.61-29.53-15.92l-15.12 4.48c-11.05-20.65-27.98-37.14-48.5-47.43l3.783-14.46c3.309-12.64-4.299-25.55-16.99-28.83c-12.76-3.309-25.67 4.295-28.96 16.92l-3.76 14.37c-9.947-.3398-26.22 .1016-66.67 11.88l-4.301-12.03c-4.406-12.3-17.1-18.81-30.34-14.34c-12.35 4.371-18.8 17.88-14.41 30.2l4.303 12.04c-20.6 8.889-40.16 19.64-58.69 31.83L225.9 81.01C217.1 70.56 203.1 68.42 192.6 76.21C182.1 84.03 179.9 98.83 187.8 109.3l7.975 10.63C178.8 134.3 163.3 150.3 149.1 167.4L138 159.3C127.5 151.6 112.6 153.9 104.8 164.5c-7.748 10.54-5.428 25.33 5.164 33.03l11.09 8.066C109.2 224.1 98.79 243.7 90.18 264.3l-12.93-4.431c-12.45-4.248-25.92 2.293-30.18 14.65C42.78 286.9 49.38 300.3 61.78 304.6l13.05 4.474c-11.86 42.33-11.02 55.76-10.39 65.93l-15.45 4.566c-12.59 3.709-19.74 16.87-16 29.38c4.053 13.61 18.1 19.36 29.52 15.93l15.02-4.441c10.78 20.21 27.57 36.73 48.53 47.24l-3.852 14.75C119.7 491.1 124.8 512 145.2 512c10.56 0 20.19-7.049 22.98-17.7l3.816-14.63c10.2 .377 35.85 .873 65.01-18.17l11.45 11.74c5.037 5.164 20.59 13.04 33.58 .4922c9.416-9.096 9.633-24.06 .4941-33.43l-12.19-12.5c7.805-12.29 13.56-26.13 16.11-41.4c1.186-7.107 3.082-13.95 5.158-20.7c10.66 4.988 15.16 7.881 22.12 7.881c8.922 0 17.46-5.018 21.51-13.59c5.582-11.8 .4785-25.89-11.4-31.45l-11.73-5.486c20.09-29.62 45.89-44.76 46.44-45.11l5.23 11.81c5.273 11.86 19.19 17.36 31.33 12.1c11.1-5.279 17.44-19.22 12.15-31.18L401.9 258.5c5.438-1.512 10.86-3.078 16.52-4.021c16.8-2.797 31.88-9.459 45.02-18.54l13.33 12.02c9.289 8.395 24.37 8.439 33.54-1.648c8.814-9.68 8.072-24.62-1.654-33.38l-12.95-11.68c11.32-18.9 16.99-41.02 15.52-64.23l15.81-4.681C539.6 128.6 546.7 115.4 543 102.9zM192 368c-26.51 0-48.01-21.49-48.01-48s21.5-48 48.01-48S240.1 293.5 240.1 320S218.6 368 192 368zM272 232c-13.25 0-23.92-10.75-23.92-24c0-13.26 10.67-23.1 23.92-23.1c13.26 0 23.1 10.74 23.1 23.1C295.1 221.3 285.3 232 272 232z"/></svg>"""
		else -> null
	}
	
}
